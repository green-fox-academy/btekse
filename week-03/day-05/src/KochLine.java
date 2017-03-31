/*import java.util.ArrayList;

/**
 * Created by Balázs on 2017. 03. 30..
 */
/*public class KochLine {

    PVector start;
    PVector end;

    KochLine(PVector a, PVector b) {
      start=a.get();
      end=b.get();
    }
  void wiggle() {
    PVEctor vel = PVector.random2D();
    start.add(vel);
    vel = PVector.random2D();
    end. add(vel);
    }

    void display() {
      stroke(0);
      // Draw the line from PVector start to end.
      line(start.x, start.y, end.x, end.y);
    }

    PVector kochA() {
      return start.get();
    }

    PVector kochB() {
      PVector v = PVector.sub(end, start);
      v.div(3);
      a.add(start);
      return v;

    PVector kochC() {
      PVector a = start.get(); //start at beginning
        PVector v = PVector.sub(end, start);
        v.div(3);
        v.add(v); //move to point B

        v.rotate(-radians(60)); //rotate 60 degrees
        a.add(v); //move to point C

        return a;
      }

    PVector kochD() {
      PVector v = PVector.sub(end, start);
      v.mult(2/3.0)
        v.add(start);
      return v;
      }

    PVector kochE() {
      return end.get();
      }


  void setup() {
    size(600, 300);
    // Create the ArrayList.
    lines = new ArrayList<KochLine>();

    // Left side of window
    PVector start = new PVector(0, 200);
    // Right side of window
    PVector end   = new PVector(width, 200);

    // The first KochLine object
    lines.add(new KochLine(start, end));
  }

  void draw() {
    background(255);
    for (KochLine l : lines) {
      l.display();
    }
  }

  is (mousePressed) {
    for (KochLine l : lines) {
      l.wiggle();
    }
  }
  }

  void generate() {
    // Create the next ArrayList...
    ArrayList next = new ArrayList<KochLine>();

    // ...for every current line.
    for (KochLine l : lines) {

      //[full] Add four new lines. (We need to figure out how
      // to compute the locations of these lines!)
      next.add(new KochLine(???,???));
      next.add(new KochLine(???,???));
      next.add(new KochLine(???,???));
      next.add(new KochLine(???,???));
      //[end]
    }
    // The new ArrayList is now the
    // one we care about!
    lines = next;
  }

    next.add(new KochLine(a,b));
    next.add(new KochLine(b,c));
    next.add(new KochLine(c,d));
    next.add(new KochLine(d,e));

  void keyPressed() {
    if(key == ' ') {
      generate();
    }
  }

  void draw() {
    background(255);
    for (KochLine l : lines) {
      l.display();
    }
  }

  void generate() {
    ArrayList next = new ArrayList<KochLine>();
    for (KochLine l : lines) {

      //[full] The KochLine object has five functions,
      // each of which return a PVector according
      // to the Koch rules.
      PVector a = l.kochA();
      PVector b = l.kochB();
      PVector c = l.kochC();
      PVector d = l.kochD();
      PVector e = l.kochE();
      //[end]

      next.add(new KochLine(a, b));
      next.add(new KochLine(b, c));
      next.add(new KochLine(c, d));
      next.add(new KochLine(d, e));
    }

    lines = next;
  }

  private class PVector {
  }
}}

*/