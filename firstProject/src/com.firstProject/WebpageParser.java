import java.util.ArrayList;

class JSObjectString {
    private final String key;
    private String value;

    JSObjectString(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }
}

class WebpageParser {
    private static final String notFound = "not found";
    private final String initial;
    private final ArrayList<JSObjectString> jsObjectStrings = new ArrayList<>();

    WebpageParser(String init) {
        final int CROP_POINT = init.indexOf("?");
        this.initial = init.substring(CROP_POINT + 1);
        parseWebName();
    }


    private void parseWebName() {
        String[] aux = this.initial.split("&");
        for (String s : aux) {
            final int CROP = s.indexOf("=");
            if (CROP == -1) {
                throw new RuntimeException("Please use only GET request web strings. Like 'g.com/index.html?ru=12&cookie45' ");
            }
            String auxString = s.substring(CROP + 1);
            System.out.println(CROP);
            String auxKey = s.substring(0, CROP);
            JSObjectString jsObjectString = new JSObjectString(auxKey, !auxString.equals("") ? auxString : notFound);
            jsObjectStrings.add(jsObjectString);
        }
    }

    public void printParsedItems() {
        JSObjectString pass = new JSObjectString("pass", notFound);
        for (int i = 0; i < jsObjectStrings.size(); i++) {
            if (jsObjectStrings.get(i).getKey().equals("pass")) {
                if (jsObjectStrings.get(i).getValue().equals(notFound)) {
                    continue;
                }
                pass.setValue(jsObjectStrings.get(i).getValue());
            }
            System.out.println(jsObjectStrings.get(i).getKey() + " : " + jsObjectStrings.get(i).getValue());
            if (i == jsObjectStrings.size() - 1) {
                if (pass.getValue().equals(notFound)) {
                    break;
                } else {
                    System.out.println("password" + " : " + pass.getValue());
                }
            }
        }
    }
}