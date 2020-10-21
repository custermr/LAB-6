class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String mTreeName, String mTreeType, boolean mLeavesFall, String mLeafColor) {
    treeName = mTreeName;
    treeType = mTreeType;
    leavesFall = mLeavesFall;
    leafColor = mLeafColor;
  }

  void setTreeName(String mTreeName) {
    treeName = mTreeName;
  }

  void setTreeType(String mTreeType) {
    treeType = mTreeType;
  }

  void setLeafColor(String mLeafColor) {
    leafColor = mLeafColor;
  }

  String getTreeName() {
    return treeName;
  }

  String getTreeType() {
    return treeType;
  }

  boolean getLeafLoss() {
    return leavesFall;
  }
  String getLeafColor(){
    return leafColor;
  }

  void print() {
    if (leavesFall) {
      System.out.println("This is a " + treeName + "tree. It is a " + treeType + " and its leaves are currently "
          + leafColor + ". It does lose its leaves for the winter.");
    } else {
      System.out.println("This is a " +    treeName + "tree. It is a " + treeType + "and its leaves are currently "
          + leafColor + ". It does not lose its leaves for the winter.");
    }
  }
}