package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	  extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	  extractedMethod(edgeList, p);
      // other implementation
      return null;
   }


   <T extends Graph> void extractedMethod(List<T> objects, String p) {
	   for (T object : objects) {
		   if ( object.contains(p))
			   System.out.println(object);
	   }
   }
}


class Graph {
	   String name;

	   public boolean contains(String p) {
	      return name.contains(p);
	   }

	}

class Node extends Graph {
}

class Edge extends Graph {
}