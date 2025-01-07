public enum Hangman {
    MISTAKE0("""
                        
                        ####
                           #
                           #
                           #
                          ###
                        """
    ),
    MISTAKE1("""
                        
                        ####
                        0  #
                           #
                           #
                          ###
                        """
    ),
    MISTAKE2("""
                        
                        ####
                        0  #
                        |  #
                           #
                          ###
                        """
    ),
    MISTAKE3("""
                         
                         ####
                         0  #
                         |\\ #
                            #
                           ###
                        """
    ),
    MISTAKE4("""
                         
                         ####
                         0  #
                        /|\\ #
                            #
                           ###
                        """
    ),
    MISTAKE5("""
                         
                         ####
                         0  #
                        /|\\ #
                        /   #
                           ###
                        """
    ),
    MISTAKE6("""
                         
                         ####
                         0  #
                        /|\\ #
                        / \\ #
                           ###
                        """
    );

    private final String gallow;

    Hangman(String gallow) {
        this.gallow = gallow;
    }
    
    public String getGallow() {
        return gallow;
    }
}
