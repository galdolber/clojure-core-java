package clojure;

import clojure.lang.*;

public final class pprint_logical_block_or_justify extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "right-params");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "format-logical-block");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "justify-clauses");
 }
 public pprint_logical_block_or_justify() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  Object __r5517 = RT.get(RT.get(params1, Keyword.intern(null, "right-params")), Keyword.intern(null, "colon"));
  if (__r5517 != null && !(__r5517 == Boolean.FALSE)) {
   return ((IFn)const__2.getRawRoot()).invoke(params1, navigator2, offsets3);
  } else {
   return ((IFn)const__3.getRawRoot()).invoke(params1, navigator2, offsets3);
  }
 }
}
