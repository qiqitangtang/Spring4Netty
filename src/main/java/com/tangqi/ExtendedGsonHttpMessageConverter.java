package com.tangqi;


/**
 * Created by wfcfan on 2016/8/29.
 */
public class ExtendedGsonHttpMessageConverter extends GsonHttpMessageConverter {


    public ExtendedGsonHttpMessageConverter() {
        super();
        super.setGson(buildGson());
    }

    protected static Gson buildGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        //输出null的字段
        gsonBuilder.serializeNulls();
        /**
         * set the time format so that new Date Adapters will be created and added to handle 3 Date types: Date, sqlDate and TimpeStamp.
         * These adapters will be at the front of the default adapters so that date will be handled by them.
         */
        gsonBuilder.setDateFormat(Constants.DATETIME_FORMAT);

        return gsonBuilder.create();
    }

}


