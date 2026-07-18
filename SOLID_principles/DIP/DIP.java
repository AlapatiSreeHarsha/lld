package SOLID_principles.DIP;
//Depend on interfaces (abstractions), not on concrete classes.
interface Recommendation{
    void recommend();
}
class TrendingRecommonation implements Recommendation{
    public void recommend(){
        System.out.println("Showing trending recommendations");
    }
}
class RecentReccommendation implements Recommendation{
    public void recommend(){
        System.out.println("Showing recent recommendations");
    }
}

class GenreRecommonation implements Recommendation{
    public void recommend(){
        System.out.println("Showing genre-specific recommendations");
    }
}

class RecommendationService{
    private Recommendation recommendation;
    public RecommendationService(Recommendation recommendation){
        this.recommendation=recommendation;
    }
    public void showRecommendation(){
        recommendation.recommend();
    }
}



public class DIP { //Netflix class
    public static void main(String[] args){
        
        Recommendation trending=new TrendingRecommonation();
        Recommendation recent=new RecentReccommendation();
        Recommendation genre=new GenreRecommonation();

        RecommendationService service=new RecommendationService(trending);
        service.showRecommendation();

        service=new RecommendationService(recent);
        service.showRecommendation();

        service=new RecommendationService(genre);
        service.showRecommendation();
    }
}
