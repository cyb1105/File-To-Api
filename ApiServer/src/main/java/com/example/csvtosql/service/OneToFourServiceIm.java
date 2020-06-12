package com.example.csvtosql.service;


import org.springframework.stereotype.Service;

import java.io.*;
import java.net.*;
import java.util.Scanner;

@Service
public class OneToFourServiceIm implements OneToFourService{

    public OneToFourServiceIm() {
    }

    @Override
    public void getURL(String filename) {
        try {
            String mURL = "http://localhost:10004/"+filename+"?key=xyz";

            URL url = new URL(mURL);

            URLConnection con = url.openConnection();
            con.setConnectTimeout(3000);
            con.setReadTimeout(3000);
            InputStream is = con.getInputStream();
            System.out.println("Request GET Method "+((HttpURLConnection)con).getResponseCode()+" OK!");


            Scanner scan = new Scanner(is);

            int line =1;
            while(scan.hasNext()){
                String str = scan.nextLine();
                System.out.println((line++) + ":" + str);
            }
            scan.close();



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void postURL() {
        try {
            String data = URLEncoder.encode("user", "UTF-8") + "=" + URLEncoder.encode("user2", "UTF-8");
            data += "&" + URLEncoder.encode("userKey", "UTF-8") + "=" + URLEncoder.encode("xyz", "UTF-8");

            URL url = new URL("http://localhost:10004/start?");
            URLConnection con = url.openConnection();
            con.setConnectTimeout(3000);
            con.setReadTimeout(3000);

            //요청 메서드 POST로 변경
            con.setDoOutput(true);

            OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
            wr.write(data);
            wr.flush();

            BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));

            wr.close();
            rd.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
