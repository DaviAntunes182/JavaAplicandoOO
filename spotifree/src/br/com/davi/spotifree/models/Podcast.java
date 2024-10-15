package br.com.davi.spotifree.models;

public class Podcast extends Audio{
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double rating() {
        double media = (double)getLikes()/getViews();
        if( media> 0.5){
            return 10;
        } else if (media > 0.4) {
            return 9;
        } else if (media > 0.3) {
            return 8;
        } else if (media > 0.2) {
            return 7;
        } else if (media > 0.1) {
            return 6;
        }else {
            return 4;
        }
    }
    @Override
    public String toString() {
        setRating();
        return  String.format(
                """
                   Podcast:     %s
                   Year:        %d
                   Duration:    %d min
                   Rating:       %.2f
                   """, getTitle(), getYear(), getDuration(), getRating());
    }
}
