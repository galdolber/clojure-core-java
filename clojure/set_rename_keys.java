package clojure;

import clojure.lang.*;

public final class set_rename_keys extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "dissoc");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "keys");
 }
 public set_rename_keys() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object map1, java.lang.Object kmap2) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.set_rename_keys_fn__6875(map1), ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), map1, ((IFn)const__3.getRawRoot()).invoke(kmap2)), kmap2);
 }
}
