package clojure;

import clojure.lang.*;

public final class pprint_pprint_newline extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.IPersistentSet const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "check-enumerated-arg");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "linear");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "miser");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "mandatory");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "fill");
  const__5 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Keyword.intern(null, "linear"), Keyword.intern(null, "miser"), Keyword.intern(null, "mandatory"), Keyword.intern(null, "fill"));
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "nl");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
 }
 public pprint_pprint_newline() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object kind1) {
  ((IFn)const__0.getRawRoot()).invoke(kind1, const__5);
  return ((IFn)const__6.getRawRoot()).invoke(const__7.get(), kind1);
 }
}
