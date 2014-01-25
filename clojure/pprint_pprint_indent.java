package clojure;

import clojure.lang.*;

public final class pprint_pprint_indent extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.IPersistentSet const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "check-enumerated-arg");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "current");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "block");
  const__3 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Keyword.intern(null, "current"), Keyword.intern(null, "block"));
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "indent");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
 }
 public pprint_pprint_indent() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object relative_to1, java.lang.Object n2) {
  ((IFn)const__0.getRawRoot()).invoke(relative_to1, const__3);
  return ((IFn)const__4.getRawRoot()).invoke(const__5.get(), relative_to1, n2);
 }
}
