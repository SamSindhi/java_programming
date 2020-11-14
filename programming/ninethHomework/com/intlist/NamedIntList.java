public class NamedIntList extends IntListArray {
  String name;
  pubic NamedIntList(int num, String name) {
    super(num);
    this.name = name;
  }

  public NamedIntList(int[] nums, String name) {
    super(nums);
    this.name = name;
  }

  @Override
  public String toString() {
    return "name: " + name + "\n" + "array: " + super.toString();
  }
}
