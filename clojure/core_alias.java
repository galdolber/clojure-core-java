package clojure;

import clojure.lang.*;

public final class core_alias extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "the-ns");
 }
 public core_alias() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object alias1, java.lang.Object namespace_sym2) {
  ((clojure.lang.Namespace)const__0.get()).addAlias((clojure.lang.Symbol)((clojure.lang.Symbol)alias1), (clojure.lang.Namespace)((clojure.lang.Namespace)((IFn)const__1.getRawRoot()).invoke(namespace_sym2)));
  return null;
 }
}
