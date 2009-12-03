package org.turtledove.gwt.client;

import org.turtledove.gwt.client.ui.CheckableTree;
import org.turtledove.gwt.client.ui.CheckableTreeItem;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TreeItem;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CheckableTreeSample implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {		
		CheckableTree tree = new CheckableTree();
		

//		TreeItem all = new CheckableTreeItem(new Label("all"));
//		TreeItem root = new CheckableTreeItem(new Label("root"));
//		TreeItem root2 = new CheckableTreeItem(new Label("root2"));
//		TreeItem leaf1 = new CheckableTreeItem(new Label("leaf1"));
//		TreeItem node1 = new CheckableTreeItem(new Label("node1"));
//		TreeItem leaf11 = new CheckableTreeItem(new Label("leaf11"));
//		TreeItem leaf12 = new CheckableTreeItem(new Label("leaf12"));
//		TreeItem node21 = new CheckableTreeItem(new Label("node21"));
//		TreeItem leaf21 = new CheckableTreeItem(new Label("leaf21"));
		

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
	}
}
