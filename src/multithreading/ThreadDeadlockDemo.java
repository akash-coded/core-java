package src.multithreading;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    TreeNode parent = null;
    List children = new ArrayList();

    public synchronized void addChild(TreeNode child) {
        if (!this.children.contains(child)) {
            this.children.add(child);
            child.setParentOnly(this);
        }
    }

    public synchronized void addChildOnly(TreeNode child) {
        if (!this.children.contains(child)) {
            this.children.add(child);
        }
    }

    public synchronized void setParent(TreeNode parent) {
        this.parent = parent;
        parent.addChildOnly(this);
    }

    public synchronized void setParentOnly(TreeNode parent) {
        this.parent = parent;
    }
}

public class ThreadDeadlockDemo {
    public static void main(String[] args) {
        TreeNode parent = new TreeNode();
        TreeNode child = new TreeNode();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                parent.addChild(child);
                child.setParentOnly(parent);
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                child.setParent(parent);
                parent.addChildOnly(child);
            }
        };

        t1.start();
        t2.start();
    }
}
