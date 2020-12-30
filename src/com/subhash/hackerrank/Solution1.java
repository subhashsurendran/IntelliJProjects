package com.subhash.hackerrank;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


class Result {
    private static String urlTemplate = "https://jsonmock.hackerrank.com/api/football_matches";

    /*
     * Complete the 'getTotalGoals' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING team
     *  2. INTEGER year
     */

    public static int getTotalGoals(String team, int year) throws IOException, ScriptException {

        int goalsAtHome = getPageTotalGoals(String.format(urlTemplate+"?team1=%s&year=%d", URLEncoder.encode(team,
                "UTF-8"), year),0,"team1", 1);
        int goalsAwayFromHome = getPageTotalGoals(String.format(urlTemplate+"?team2=%s&year=%d", URLEncoder.encode(team,
                "UTF-8"), year), 0,"team2", 1);


        return goalsAtHome+goalsAwayFromHome;
    }

    private static int getPageTotalGoals(String request, int totalGoals, String team, int page) throws IOException,
            ScriptException {
        URL url = new URL(request+"&page="+page);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        httpURLConnection.setConnectTimeout(5000);

        int responseCode = httpURLConnection.getResponseCode();
        InputStream in = (responseCode <200 || responseCode>2990? httpURLConnection.getErrorStream():
                httpURLConnection.getInputStream());

        BufferedReader bf = new BufferedReader(new InputStreamReader(in));
        StringBuffer buffer =new StringBuffer();
        String readLine;

        while((readLine=bf.readLine())!=null){
            buffer.append(readLine);
        }
        bf.close();
        httpURLConnection.disconnect();

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine javascript = scriptEngineManager.getEngineByName("javascript");

        String script = "var obj = JSON.parse('"+ buffer.toString()+"');";
        script+= "var total_pages = obj.total_pages;";
        script+="var total_goals = obj.data.reduce(function(accumulator, current){" +
                "return accumulator + parseInt(current."+ team+"goals);}, 0);";

        Object eval = javascript.eval(script);

        if(javascript.get("total_pages") == null){
            throw new RuntimeException();
        }

        int totalPages = (int)javascript.get("total_pages");
        totalGoals+= (int)Double.parseDouble(javascript.get("total_goals").toString());
        return (page<totalPages)? getPageTotalGoals(request, totalGoals, team,page+1):totalGoals;
    }

    public static int getNumDraws(int year) throws IOException, ScriptException {

        final String endpoint ="https://jsonmock.hackerrank.com/api/football_matches?year="+year;
        final int maxScore =10;

        int totalNumDraws =0;

        for(int score =0; score<=maxScore; score++){
            totalNumDraws+=getTotalNumDraws(String.format(endpoint + "&team1goals=%d&team2goals=%d", score, score));
            
        }
        return totalNumDraws;

    }

    private static int getTotalNumDraws(String request) throws IOException, ScriptException {

        URL url = new URL(request);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);

        int status = httpURLConnection.getResponseCode();

        InputStream inputStream = (status < 200 || status > 299) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String readline;
        StringBuffer response = new StringBuffer();

        while((readline=br.readLine())!=null){
                response.append(readline);
        }
        br.close();
        httpURLConnection.disconnect();

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");

        String script="var obj - JSON.parse('"+response.toString()+"');";
        script+="var total = obj.total;";

        engine.eval(script);

        if(engine.get("total")==null){
            throw new RuntimeException();

        }

        return (int)engine.get("total");
    }
}

public class Solution1 {
    public static void main(String[] args) throws IOException, ScriptException {

        int result = Result.getTotalGoals("Barcelona", 2011);
        System.out.println(result);

    }
}
