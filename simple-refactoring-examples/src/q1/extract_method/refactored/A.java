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

   <T extends Graph> void extractedMethod(List<T> items, String p)
   {
	   for(T t : items)
	   {
		   if(t.contains(p))
		   {
			   System.out.println(t);
		   }
	   }
   }
}

abstract class Graph
{
	abstract boolean contains(String p);
}

class Node extends Graph 
{
   String nodeName;
   
   boolean contains(String p)
   {
	   return nodeName.contains(p);
   }
}

class Edge extends Graph
{
   String edgeName;
   
   boolean contains(String p)
   {
	   return edgeName.contains(p);
   }
}