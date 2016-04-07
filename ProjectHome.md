## 1. sample ##
![http://checkable-tree.googlecode.com/svn/trunk/sites/images/sample.png](http://checkable-tree.googlecode.com/svn/trunk/sites/images/sample.png)

## 2. usage ##
  * add
```

	<inherits name="org.turtledove.gwt.CheckableTree" />
```
into your XX.gwt.xml file.
  * source code of sample:
```
		CheckableTree tree = new CheckableTree();
		TreeItem all = new CheckableTreeItem("<bold>all</bold>");
		TreeItem root = new CheckableTreeItem("root");
		TreeItem root2 = new CheckableTreeItem("root2");
		TreeItem leaf1 = new CheckableTreeItem("leaf1");
		TreeItem node1 = new CheckableTreeItem("node1");
		TreeItem leaf11 = new CheckableTreeItem("leaf11");
		TreeItem leaf12 = new CheckableTreeItem("leaf12");
		TreeItem node21 = new CheckableTreeItem("node21");
		TreeItem leaf21 = new CheckableTreeItem("leaf21");
		
		root.setHTML("<b>root</b>");
		
		root.addItem(node1);
		root.addItem(leaf1);
		node1.addItem(leaf11);
		node1.addItem(leaf12);
		all.addItem(root);
		all.addItem(root2);
		root2.addItem(node21);
		node21.addItem(leaf21);

		tree.addItem(all);
		RootPanel.get().add(tree);
```

## 3. state diagram ##
![http://checkable-tree.googlecode.com/svn/trunk/sites/images/state.png](http://checkable-tree.googlecode.com/svn/trunk/sites/images/state.png)