package clojure.core;

import clojure.lang.*;

public final class VecNode extends java.lang.Object implements clojure.lang.IType {
 static {
 }
 public  final Object edit;
 public  final Object arr;
 public VecNode(final Object edit, final Object arr) {
  super();
  this.edit = edit;
  this.arr = arr;
 }
 public static clojure.lang.IPersistentVector getBasis() {
  return RT.vector(Symbol.intern(null, "edit"), Symbol.intern(null, "arr"));
 }
}
