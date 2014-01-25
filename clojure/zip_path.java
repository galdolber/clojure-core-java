package clojure;

import clojure.lang.*;

public final class zip_path extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "pnodes");
  const__1 = (java.lang.Object)1L;
 }
 public zip_path() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1) {
  return RT.get(((IFn)loc1).invoke(const__1), Keyword.intern(null, "pnodes"));
 }
}
