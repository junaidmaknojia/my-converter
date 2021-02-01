package com.example.converterapp;

import java.util.LinkedList;

public class Currency {
    private String mUnit;
    private double mEntry;
    private final LinkedList<String> mList = new LinkedList<>();
    private double[]currArray;

    public Currency(String unit, double entry){
        mUnit = unit;
        mEntry = entry;
    }
    public LinkedList<String> currConv(){
        if(mUnit != null) {
            //double
            double[] currArray = null;
            switch (mUnit) {
                case "":
                    currArray = new double[]{};
                    break;
            }
            if (currArray != null) {
                for (int i = 0; i < currArray.length; i++) {
                    currArray[i] *= mEntry;
                    mList.add(String.valueOf(currArray[i]));
                }
                return mList;
            }
        }
        return null;
    }

    /**
     *
     * https://www.exchangerate-api.com/docs/java-currency-api
     * String url_str = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD";
     *
     * // Making Request
     * URL url = new URL(url_str);
     * HttpURLConnection request = (HttpURLConnection) url.openConnection();
     * request.connect();
     *
     * // Convert to JSON
     * JsonParser jp = new JsonParser();
     * JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
     * JsonObject jsonobj = root.getAsJsonObject();
     *
     * // Accessing object
     * String req_result = jsonobj.get("result").getAsString();
     *
     * {
     * 	"result": "success",
     * 	"documentation": "https://www.exchangerate-api.com/docs",
     * 	"terms_of_use": "https://www.exchangerate-api.com/terms",
     * 	"time_last_update_unix": 1585267200,
     * 	"time_last_update_utc": "Fri, 27 Mar 2020 00:00:00 +0000",
     * 	"time_next_update_unix": 1585353700,
     * 	"time_next_update_utc": "Sat, 28 Mar 2020 00:00:00 +0000",
     * 	"base_code": "USD",
     * 	"conversion_rates": {
     * 		"USD": 1,
     * 		"AUD": 1.4817,
     * 		"BGN": 1.7741,
     * 		"CAD": 1.3168,
     * 		"CHF": 0.9774,
     * 		"CNY": 6.9454,
     * 		"EGP": 15.7361,
     * 		"EUR": 0.9013,
     * 		"GBP": 0.7679,
     * 		"...": 7.8536,
     * 		"...": 1.3127,
     * 		"...": 7.4722, etc. etc.
     *        }
     * }
     *
     * */
}
