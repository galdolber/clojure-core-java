package clojure;

import clojure.lang.*;

public final class pprint_fn__8016 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "pretty-character");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "at");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "readable-character");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "plain-character");
 }
 public pprint_fn__8016() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object offset2) {
  Object __r5665 = RT.get(params1, Keyword.intern(null, "colon"));
  if (__r5665 != null && !(__r5665 == Boolean.FALSE)) {
   return const__1.getRawRoot();
  } else {
   Object __r5667 = RT.get(params1, Keyword.intern(null, "at"));
   if (__r5667 != null && !(__r5667 == Boolean.FALSE)) {
    return const__3.getRawRoot();
   } else {
    Object __r5669 = const__4;
    if (__r5669 != null && !(__r5669 == Boolean.FALSE)) {
     return const__5.getRawRoot();
    } else {
     return null;
    }
   }
  }
 }
}
