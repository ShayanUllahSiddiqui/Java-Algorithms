class AuthorInfo {
    String name;
    String email;
    String orginization;
    int paper_published;

    AuthorInfo(String name, String email, String originization, int paper_published) {
        this.name = name;
        this.email = email;
        this.orginization = originization;
        this.paper_published = paper_published;
    }
    
    void AuthorData() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Orginazation: " + orginization);
        System.out.println("Paper_Published: " + paper_published);
        System.out.println("---------------------");
    }
}

class Paper {
    String paperTitle;
    String paperAuthor;
    String journalName;
    int no_citation;

    Paper(String paperTitle, String paperAuthor, String journalName, int no_citation) {
        this.paperTitle = paperTitle;
        this.paperAuthor = paperAuthor;
        this.journalName = journalName;
        this.no_citation = no_citation;
    }
    
    void PaperData() {
        System.out.println("Title of paper: " + paperTitle);
        System.out.println("Paper's Author name: " + paperAuthor);
        System.out.println("Jorunal's name: " + journalName);
        System.out.println("Number of citation: " + no_citation);
        System.out.println("---------------------");
    }

}

class Journal {
    String nameOfJournal;
    String journalImpactFactor;
    int no_cited_articles;   
    int total_articles;

    Journal(String nameOfJournal, String journalImpactFactor, int no_cited_articles, int total_articles) {
        this.nameOfJournal = nameOfJournal;
        this.journalImpactFactor = journalImpactFactor;
        this.no_cited_articles = no_cited_articles;
        this.total_articles = total_articles;
    }
    
    void JournalData() {
        int result = total_articles / no_cited_articles;
        System.out.println("Journal Name: " + nameOfJournal);
        System.out.println("Impact Factor: " + result);
        System.out.println("Number of cited articles: " + no_cited_articles);
        System.out.println("Total number of articles: " + total_articles);

    
        
    }
}

public class Author {
    public static void main(String args[]) {
        AuthorInfo authorData = new AuthorInfo("David", "david123@yahoo.com", "Jang", 10);
        authorData.AuthorData();
        
        Paper paperData = new Paper("English", "Jon", "GOT", 8);
        paperData.PaperData();

        Journal journalData = new Journal("PC", "2.5", 5, 15);
        journalData.JournalData();
    }
} 