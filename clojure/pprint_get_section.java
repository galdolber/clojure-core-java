package clojure;

import clojure.lang.*;

public final class pprint_get_section extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "take-while");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "count");
 }
 public pprint_get_section() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object buffer1) {
  {
   Object nl2 = ((IFn)const__0.getRawRoot()).invoke(buffer1);
   Object lb3 = RT.get(nl2, Keyword.intern(null, "logical-block"));
   Object section4 = ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(new clojure.pprint_get_section_fn__7502(lb3), ((IFn)const__4.getRawRoot()).invoke(buffer1)));
   return RT.vector(section4, ((IFn)const__2.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(Numbers.num(clojure.lang.Numbers.inc((long)clojure.lang.RT.count(((java.lang.Object)section4)))), buffer1)));
  }
 }
}
