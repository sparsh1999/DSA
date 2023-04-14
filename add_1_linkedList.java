reverse(Node root) {
	if (root==null) {
		return 1;
	}
	
	root.data += reverse(root.right);
	int carry = root.data/10;
	root.data = root.data%10;
	
	return carry;
}
