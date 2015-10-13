public class Node { 
	public Node firstChild; 
	public Node nextSibling;
}

public int countDescendents (Node node) {
	int numDescendent;
	//Declaring a linkedList for the list of nodes
	LinkedList<Node> list = new LinkedList<Node>();
	//If node has descendants, push it onto the list.
	if(node.firstChild != NULL && node != NULL) {
		list.push(node.firstChild);
		numDescendent++;	
	}
	//If list ist not empty, iterate through it.
	while(!list.isEmpty()) {
		//Set current node to first on the list
		Node b = list.pop();
		//Checking if the firstChild is valid
		if(b.firstChild != NULL) {
			list.push(b.firstChild);
			numDescendent++;
		}
		//Checking if nextSibling is valid
		if(b.nextSibling != NULL) {
			list.push(b.nextSibling);
			numDescendent++;
		}
	}
	return numDescendent;
}

