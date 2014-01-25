package clojure;

import clojure.lang.*;

public final class pprint_relative_reposition extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "pos");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "absolute-reposition");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "arg-navigator");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "seq");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "rest");
 }
 public pprint_relative_reposition() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object navigator1, java.lang.Object position2) {
  {
   Object newpos3 = ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)RT.get(navigator1, Keyword.intern(null, "pos"))), ((java.lang.Object)position2)));
   if (clojure.lang.Numbers.isNeg(((java.lang.Object)position2))) {
    return ((IFn)const__3.getRawRoot()).invoke(navigator1, newpos3);
   } else {
    return ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), RT.get(navigator1, Keyword.intern(null, "seq")), ((IFn)const__7.getRawRoot()).invoke(position2, RT.get(navigator1, Keyword.intern(null, "rest"))), newpos3);
   }
  }
 }
}
