package clojure;

import clojure.lang.*;

public final class core_merge_with extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "identity");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
 }
 public core_merge_with() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object maps2) {
  Object __r2544 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), maps2);
  if (__r2544 != null && !(__r2544 == Boolean.FALSE)) {
   {
    Object merge_entry3 = new clojure.core_merge_with_merge_entry__4305(f1);
    Object merge24 = new clojure.core_merge_with_merge2__4307(merge_entry3);
    return ((IFn)const__2.getRawRoot()).invoke(merge24, maps2);
   }
  } else {
   return null;
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
