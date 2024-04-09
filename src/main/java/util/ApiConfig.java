package util;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ApiConfig
{

    private final String baseUrl;

    // Endpoints for data filtering
    private final String countryNameEndpoint;
    private final String countryCurrencyEndpoint;
    private final String countryLanguageEndpoint;
    private final String countryCapitalEndpoint;
    private final String countryRegionEndpoint;
    private final String countrySubregionEndpoint;

    // Parameters to apply to endpoints
    // Country names
    private final String usa;
    private final String france;
    private final String germany;
    private final String ukraine;
    private final String spain;

    // Currencies
    private final String usd;
    private final String eur;
    private final String uah;

    // Languages
    private final String english;
    private final String french;
    private final String german;
    private final String ukranian;
    private final String spanish;

    // Capitals
    private final String washington;
    private final String paris;
    private final String berlin;
    private final String kyiv;
    private final String madrid;

    // Regions
    private final String america;
    private final String europe;

    // Subregions
    private final String northAmerica;
    private final String westernEurope;
    private final String southernEurope;
    private final String easternEurope;


    // Application configuration objects and file names
    private Configurations configs = null;
    private Configuration config = null;
    private final String applicationPropertiesFileName = "application.properties";

    public String getBaseUrl()
            throws ConfigurationException {return baseUrl;}

    // Getters for endpoints
    public String getCountryNameEndpoint()
            throws ConfigurationException {return countryNameEndpoint;}

    public String getCountryCurrencyEndpoint()
            throws ConfigurationException {return countryCurrencyEndpoint;}

    public String getCountryLanguageEndpoint()
            throws ConfigurationException {return countryLanguageEndpoint;}

    public String getCountryCapitalEndpoint()
            throws ConfigurationException {return countryCapitalEndpoint;}

    public String getCountryRegionEndpoint()
            throws ConfigurationException {return countryRegionEndpoint;}

    public String getCountrySubregionEndpoint()
            throws ConfigurationException {return countrySubregionEndpoint;}

    // Getters for parameters
    // Getters for country names
    public String getUsa() throws ConfigurationException {return usa;}

    public String getFrance() throws ConfigurationException {return france;}
    public String getGermany() throws ConfigurationException {return germany;}
    public String getUkraine() throws ConfigurationException {return ukraine;}
    public String getSpain() throws ConfigurationException {return spain;}

    // Getters for currencies
    public String getUsd() throws ConfigurationException {return usd;}
    public String getEur() throws ConfigurationException {return eur;}
    public String getUah() throws ConfigurationException {return uah;}

    // Getters for languages
    public String getEnglish() throws ConfigurationException {return english;}
    public String getFrench() throws ConfigurationException {return french;}
    public String getGerman() throws ConfigurationException {return german;}
    public String getUkranian() throws ConfigurationException {return ukranian;}
    public String getSpanish() throws ConfigurationException {return spanish;}

    // Getters for capitals
    public String getWashington() throws ConfigurationException {return washington;}
    public String getParis() throws ConfigurationException {return paris;}
    public String getBerlin() throws ConfigurationException {return berlin;}
    public String getKyiv() throws ConfigurationException {return kyiv;}
    public String getMadrid() throws ConfigurationException {return madrid;}

    // Getters for regions
    public String getAmerica() throws ConfigurationException {return america;}
    public String getEurope() throws ConfigurationException {return europe;}

    // Getters for subregions
    public String getNorthAmerica() throws ConfigurationException {return northAmerica;}
    public String getWesternEurope() throws ConfigurationException {return westernEurope;}
    public String getSouthernEurope() throws ConfigurationException {return southernEurope;}
    public String getEasternEurope() throws ConfigurationException {return easternEurope;}

    public ApiConfig() throws ConfigurationException
    {
        this.configs = new Configurations();
        this.config = configs.propertiesBuilder(applicationPropertiesFileName).getConfiguration();

        this.baseUrl = config.getString("base.url");

        // Endpoints initialization
        this.countryNameEndpoint = config.getString("country.name.endpoint");
        this.countryCurrencyEndpoint = config.getString("country.currency.endpoint");
        this.countryLanguageEndpoint = config.getString("country.language.endpoint");
        this.countryCapitalEndpoint = config.getString("country.capital.endpoint");
        this.countryRegionEndpoint = config.getString("country.region.endpoint");
        this.countrySubregionEndpoint = config.getString("country.subregion.endpoint");

        // Country names initialization
        this.usa = config.getString("usa");
        this.france = config.getString("france");
        this.germany = config.getString("germany");
        this.ukraine = config.getString("ukraine");
        this.spain = config.getString("spain");

        // Currencies initialization
        this.usd = config.getString("usd");
        this.eur = config.getString("eur");
        this.uah = config.getString("uah");

        // Languages initialization
        this.english = config.getString("english");
        this.french = config.getString("french");
        this.german = config.getString("german");
        this.ukranian = config.getString("ukranian");
        this.spanish = config.getString("spanish");

        // Capitals initialization
        this.washington = config.getString("washington");
        this.paris = config.getString("paris");
        this.berlin = config.getString("berlin");
        this.kyiv = config.getString("kyiv");
        this.madrid = config.getString("madrid");

        // Regions initialization
        this.america = config.getString("america");
        this.europe = config.getString("europe");

        // Subregions initialization
        this.northAmerica = config.getString("north.america");
        this.westernEurope = config.getString("western.europe");
        this.southernEurope = config.getString("southern.europe");
        this.easternEurope = config.getString("eastern.europe");


    }

}