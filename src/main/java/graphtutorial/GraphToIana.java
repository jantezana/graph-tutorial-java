package graphtutorial;

import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

// Basic lookup for mapping Windows time zone identifiers to
// IANA identifiers
// Mappings taken from
// https://github.com/unicode-org/cldr/blob/master/common/supplemental/windowsZones.xml
public class GraphToIana {

    private static final Map<String, String> timeZoneIdMap = new HashMap<String, String>() {{
        put("Dateline Standard Time", "Etc/GMT+12");
        put("UTC-11", "Etc/GMT+11");
        put("Aleutian Standard Time", "America/Adak");
        put("Hawaiian Standard Time", "Pacific/Honolulu");
        put("Marquesas Standard Time", "Pacific/Marquesas");
        put("Alaskan Standard Time", "America/Anchorage");
        put("UTC-09", "Etc/GMT+9");
        put("Pacific Standard Time (Mexico)", "America/Tijuana");
        put("UTC-08", "Etc/GMT+8");
        put("Pacific Standard Time", "America/Los_Angeles");
        put("US Mountain Standard Time", "America/Phoenix");
        put("Mountain Standard Time (Mexico)", "America/Chihuahua");
        put("Mountain Standard Time", "America/Denver");
        put("Central America Standard Time", "America/Guatemala");
        put("Central Standard Time", "America/Chicago");
        put("Easter Island Standard Time", "Pacific/Easter");
        put("Central Standard Time (Mexico)", "America/Mexico_City");
        put("Canada Central Standard Time", "America/Regina");
        put("SA Pacific Standard Time", "America/Bogota");
        put("Eastern Standard Time (Mexico)", "America/Cancun");
        put("Eastern Standard Time", "America/New_York");
        put("Haiti Standard Time", "America/Port-au-Prince");
        put("Cuba Standard Time", "America/Havana");
        put("US Eastern Standard Time", "America/Indianapolis");
        put("Turks And Caicos Standard Time", "America/Grand_Turk");
        put("Paraguay Standard Time", "America/Asuncion");
        put("Atlantic Standard Time", "America/Halifax");
        put("Venezuela Standard Time", "America/Caracas");
        put("Central Brazilian Standard Time", "America/Cuiaba");
        put("SA Western Standard Time", "America/La_Paz");
        put("Pacific SA Standard Time", "America/Santiago");
        put("Newfoundland Standard Time", "America/St_Johns");
        put("Tocantins Standard Time", "America/Araguaina");
        put("E. South America Standard Time", "America/Sao_Paulo");
        put("SA Eastern Standard Time", "America/Cayenne");
        put("Argentina Standard Time", "America/Buenos_Aires");
        put("Greenland Standard Time", "America/Godthab");
        put("Montevideo Standard Time", "America/Montevideo");
        put("Magallanes Standard Time", "America/Punta_Arenas");
        put("Saint Pierre Standard Time", "America/Miquelon");
        put("Bahia Standard Time", "America/Bahia");
        put("UTC-02", "Etc/GMT+2");
        put("Azores Standard Time", "Atlantic/Azores");
        put("Cape Verde Standard Time", "Atlantic/Cape_Verde");
        put("UTC", "Etc/GMT");
        put("GMT Standard Time", "Europe/London");
        put("Greenwich Standard Time", "Atlantic/Reykjavik");
        put("Sao Tome Standard Time", "Africa/Sao_Tome");
        put("Morocco Standard Time", "Africa/Casablanca");
        put("W. Europe Standard Time", "Europe/Berlin");
        put("Central Europe Standard Time", "Europe/Budapest");
        put("Romance Standard Time", "Europe/Paris");
        put("Central European Standard Time", "Europe/Warsaw");
        put("W. Central Africa Standard Time", "Africa/Lagos");
        put("Jordan Standard Time", "Asia/Amman");
        put("GTB Standard Time", "Europe/Bucharest");
        put("Middle East Standard Time", "Asia/Beirut");
        put("Egypt Standard Time", "Africa/Cairo");
        put("E. Europe Standard Time", "Europe/Chisinau");
        put("Syria Standard Time", "Asia/Damascus");
        put("West Bank Standard Time", "Asia/Hebron");
        put("South Africa Standard Time", "Africa/Johannesburg");
        put("FLE Standard Time", "Europe/Kiev");
        put("Israel Standard Time", "Asia/Jerusalem");
        put("Kaliningrad Standard Time", "Europe/Kaliningrad");
        put("Sudan Standard Time", "Africa/Khartoum");
        put("Libya Standard Time", "Africa/Tripoli");
        put("Namibia Standard Time", "Africa/Windhoek");
        put("Arabic Standard Time", "Asia/Baghdad");
        put("Turkey Standard Time", "Europe/Istanbul");
        put("Arab Standard Time", "Asia/Riyadh");
        put("Belarus Standard Time", "Europe/Minsk");
        put("Russian Standard Time", "Europe/Moscow");
        put("E. Africa Standard Time", "Africa/Nairobi");
        put("Iran Standard Time", "Asia/Tehran");
        put("Arabian Standard Time", "Asia/Dubai");
        put("Astrakhan Standard Time", "Europe/Astrakhan");
        put("Azerbaijan Standard Time", "Asia/Baku");
        put("Russia Time Zone 3", "Europe/Samara");
        put("Mauritius Standard Time", "Indian/Mauritius");
        put("Saratov Standard Time", "Europe/Saratov");
        put("Georgian Standard Time", "Asia/Tbilisi");
        put("Volgograd Standard Time", "Europe/Volgograd");
        put("Caucasus Standard Time", "Asia/Yerevan");
        put("Afghanistan Standard Time", "Asia/Kabul");
        put("West Asia Standard Time", "Asia/Tashkent");
        put("Ekaterinburg Standard Time", "Asia/Yekaterinburg");
        put("Pakistan Standard Time", "Asia/Karachi");
        put("Qyzylorda Standard Time", "Asia/Qyzylorda");
        put("India Standard Time", "Asia/Calcutta");
        put("Sri Lanka Standard Time", "Asia/Colombo");
        put("Nepal Standard Time", "Asia/Katmandu");
        put("Central Asia Standard Time", "Asia/Almaty");
        put("Bangladesh Standard Time", "Asia/Dhaka");
        put("Omsk Standard Time", "Asia/Omsk");
        put("Myanmar Standard Time", "Asia/Rangoon");
        put("SE Asia Standard Time", "Asia/Bangkok");
        put("Altai Standard Time", "Asia/Barnaul");
        put("W. Mongolia Standard Time", "Asia/Hovd");
        put("North Asia Standard Time", "Asia/Krasnoyarsk");
        put("N. Central Asia Standard Time", "Asia/Novosibirsk");
        put("Tomsk Standard Time", "Asia/Tomsk");
        put("China Standard Time", "Asia/Shanghai");
        put("North Asia East Standard Time", "Asia/Irkutsk");
        put("Singapore Standard Time", "Asia/Singapore");
        put("W. Australia Standard Time", "Australia/Perth");
        put("Taipei Standard Time", "Asia/Taipei");
        put("Ulaanbaatar Standard Time", "Asia/Ulaanbaatar");
        put("Aus Central W. Standard Time", "Australia/Eucla");
        put("Transbaikal Standard Time", "Asia/Chita");
        put("Tokyo Standard Time", "Asia/Tokyo");
        put("North Korea Standard Time", "Asia/Pyongyang");
        put("Korea Standard Time", "Asia/Seoul");
        put("Yakutsk Standard Time", "Asia/Yakutsk");
        put("Cen. Australia Standard Time", "Australia/Adelaide");
        put("AUS Central Standard Time", "Australia/Darwin");
        put("E. Australia Standard Time", "Australia/Brisbane");
        put("AUS Eastern Standard Time", "Australia/Sydney");
        put("West Pacific Standard Time", "Pacific/Port_Moresby");
        put("Tasmania Standard Time", "Australia/Hobart");
        put("Vladivostok Standard Time", "Asia/Vladivostok");
        put("Lord Howe Standard Time", "Australia/Lord_Howe");
        put("Bougainville Standard Time", "Pacific/Bougainville");
        put("Russia Time Zone 10", "Asia/Srednekolymsk");
        put("Magadan Standard Time", "Asia/Magadan");
        put("Norfolk Standard Time", "Pacific/Norfolk");
        put("Sakhalin Standard Time", "Asia/Sakhalin");
        put("Central Pacific Standard Time", "Pacific/Guadalcanal");
        put("Russia Time Zone 11", "Asia/Kamchatka");
        put("New Zealand Standard Time", "Pacific/Auckland");
        put("UTC+12", "Etc/GMT-12");
        put("Fiji Standard Time", "Pacific/Fiji");
        put("Chatham Islands Standard Time", "Pacific/Chatham");
        put("UTC+13", "Etc/GMT-13");
        put("Tonga Standard Time", "Pacific/Tongatapu");
        put("Samoa Standard Time", "Pacific/Apia");
        put("Line Islands Standard Time", "Pacific/Kiritimati");
    }};


    public static String getIanaFromWindows(String windowsTimeZone) {
        String iana = timeZoneIdMap.get(windowsTimeZone);

        // If a mapping was not found, assume the value passed
        // was already an IANA identifier
        return (iana == null) ? windowsTimeZone : iana;
    }

    public static ZoneId getZoneIdFromWindows(String windowsTimeZone) {
        String timeZoneId = getIanaFromWindows(windowsTimeZone);

        return ZoneId.of(timeZoneId);
    }
}
