package clojure;

import clojure.lang.*;

public final class pprint_fn__7495 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "intra-block-nl");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "tokens-fit?");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "miser-nl?");
 }
 public pprint_fn__7495() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object newl1, java.lang.Object this2, java.lang.Object section3, java.lang.Object subsection4) {
  {
   Object lb5 = RT.get(newl1, Keyword.intern(null, "logical-block"));
   {
    Object or__3968__auto__6 = ((IFn)const__1.getRawRoot()).invoke(RT.get(lb5, Keyword.intern(null, "intra-block-nl")));
    Object __r4913 = or__3968__auto__6;
    if (__r4913 != null && !(__r4913 == Boolean.FALSE)) {
     return or__3968__auto__6;
    } else {
     {
      Object or__3968__auto__7 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(this2, subsection4));
      Object __r4915 = or__3968__auto__7;
      if (__r4915 != null && !(__r4915 == Boolean.FALSE)) {
       return or__3968__auto__7;
      } else {
       return ((IFn)const__5.getRawRoot()).invoke(this2, lb5, section3);
      }
     }
    }
   }
  }
 }
}
