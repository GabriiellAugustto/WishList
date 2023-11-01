package br.com.etecia.wishlist;

public class Api {

        private static final String ROOT_URL = "http://ipconfig/HeroApi/v1/Api.php?apicall=";

        public static final String URL_CREATE_LIST = ROOT_URL + "createlist";
        public static final String URL_READ_LIST = ROOT_URL + "getlist";
        public static final String URL_UPDATE_LIST = ROOT_URL + "updatelist";
        public static final String URL_DELETE_LIST = ROOT_URL + "deletelist&id=";
}
