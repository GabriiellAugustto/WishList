package br.com.etecia.wishlist;

public class Api {

        private static final String ROOT_URL = "http://ipconfig/HeroApi/v1/Api.php?apicall=";

        public static final String URL_CREATE_HERO = ROOT_URL + "createlist";
        public static final String URL_READ_HEROES = ROOT_URL + "getlist";
        public static final String URL_UPDATE_HERO = ROOT_URL + "updatelist";
        public static final String URL_DELETE_HERO = ROOT_URL + "deletelist&id=";
}
