package clojure;

import clojure.lang.*;

public final class pprint_pprint_tab extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.IPersistentSet const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "check-enumerated-arg");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "section-relative");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "section");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "line-relative");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Keyword.intern(null, "section-relative"), Keyword.intern(null, "section"), Keyword.intern(null, "line-relative"), Keyword.intern(null, "line"));
 }
 public pprint_pprint_tab() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object kind1, java.lang.Object colnum2, java.lang.Object colinc3) {
  ((IFn)const__0.getRawRoot()).invoke(kind1, const__5);
  Util.trow((Throwable)new java.lang.UnsupportedOperationException((java.lang.String)((java.lang.String)"pprint-tab is not yet implemented")));
  return null;
 }
}
