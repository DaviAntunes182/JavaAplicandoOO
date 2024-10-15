package br.com.davi.spotifree.models;

public class Music extends Audio{
    private String album;
    private String style;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public double rating() {
        if(getViews() >= 500){
            return 10;
        }
        else if(getViews() >= 300){
            return 8;
        }
        else if(getViews() >= 100){
            return 6;
        } else if (getViews() >= 50) {
            return 4;
        } else {
            return 2;
        }
    }
    @Override
    public String toString() {
        setRating();
        return  String.format(
                """
                   Music:      %s
                   Year:        %d
                   Duration:    %d sec
                   Rating: %.2f
                   """, getTitle(), getYear(), getDuration(), getRating());
    }
}
