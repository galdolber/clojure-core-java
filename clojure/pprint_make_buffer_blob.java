package clojure;

import clojure.lang.*;

public final class pprint_make_buffer_blob extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "buffer-blob");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "buffer-blob");
 }
 public pprint_make_buffer_blob() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object vals__7418__auto__1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), const__2.getRawRoot(), const__3, vals__7418__auto__1);
 }
 public int getRequiredArity() {
  return 0;
 }
}
