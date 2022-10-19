 public class ServerNameGenerator {
            private String[] adjectives;
            private String[] nouns;

            public ServerNameGenerator() {
                this.adjectives = new String[]{"good", "boiled", "salty", "strong", "blue", "teenage", "smelly", "soft",
                        "juicy", "sticky"};
                this.nouns = new String[]{"uncle", "aunt", "paper", "sauce", "princess", "tiara", "bike", "car", "hoodie", "desk"};
            }

            public String getAdjective() {
                return adjectives[(int) Math.floor(Math.random() * 10)];
            }

            public String getNoun() {
                return nouns[(int) Math.floor(Math.random() * 10)];
            }

            public static void main(String[] args) {
                ServerNameGenerator serverName = new ServerNameGenerator();
                System.out.printf("Here is your server name:%n%s-%s",(serverName.getAdjective()),
                        (serverName.getNoun()) );

            }
        }




