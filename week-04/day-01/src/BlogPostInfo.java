/**
 * Created by Balázs on 2017. 04. 03..
 */
public class BlogPostInfo {
  public static void main(String args[]) {
    BlogPost blogPostInfo1 = new BlogPost();
    blogPostInfo1.title = "Lorem Ipsum";
    blogPostInfo1.authorName = "John Doe";
    blogPostInfo1.text = "Lorem ipsum dolor sit amet.";
    blogPostInfo1.PublicationDate = "2000.05.04.";

    BlogPost blogPostInfo2 = new BlogPost();
    blogPostInfo2.title = "Wait but why";
    blogPostInfo2.authorName = "Tim Urban";
    blogPostInfo2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    blogPostInfo2.PublicationDate = "2010.10.10.";

    BlogPost blogPostInfo3 = new BlogPost();
    blogPostInfo3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    blogPostInfo3.authorName = "William Turton";
    blogPostInfo3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
    blogPostInfo3.PublicationDate = "2017.03.28.";

    //System.out.println(blogPostInfo3.title);

    blogPostInfo1.textwrite();
    blogPostInfo2.textwrite();
    blogPostInfo3.textwrite();

  }
}
