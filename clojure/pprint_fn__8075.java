package clojure;

import clojure.lang.*;

public final class pprint_fn__8075 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "boolean-conditional");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "check-arg-conditional");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "choice-conditional");
 }
 public pprint_fn__8075() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object offset2) {
  Object __r5696 = RT.get(params1, Keyword.intern(null, "colon"));
  if (__r5696 != null && !(__r5696 == Boolean.FALSE)) {
   return const__1.getRawRoot();
  } else {
   Object __r5698 = RT.get(params1, Keyword.intern(null, "at"));
   if (__r5698 != null && !(__r5698 == Boolean.FALSE)) {
    return const__3.getRawRoot();
   } else {
    Object __r5700 = Boolean.TRUE;
    if (__r5700 != null && !(__r5700 == Boolean.FALSE)) {
     return const__4.getRawRoot();
    } else {
     return null;
    }
   }
  }
 }
}
