package clojure;

import clojure.lang.*;

public final class pprint_float_parts_base extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final java.lang.Object const__8;
 public static final clojure.lang.Var const__9;
 public static final java.lang.Object const__10;
 public static final java.lang.Object const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (java.lang.Object)Character.valueOf((char)101);
  const__2 = (java.lang.Object)Character.valueOf((char)46);
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__8 = (java.lang.Object)0L;
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__10 = (java.lang.Object)1L;
  const__11 = (java.lang.Object)2L;
 }
 public pprint_float_parts_base() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  {
   Object s2 = ((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Object)f1).toString())).toLowerCase());
   int exploc3 = ((java.lang.String)s2).indexOf((int)clojure.lang.RT.intCast(((java.lang.Object)const__1)));
   int dotloc4 = ((java.lang.String)s2).indexOf((int)clojure.lang.RT.intCast(((java.lang.Object)const__2)));
   if (clojure.lang.Numbers.isNeg((long)exploc3)) {
    if (clojure.lang.Numbers.isNeg((long)dotloc4)) {
     return RT.vector(s2, ((IFn)const__4.getRawRoot()).invoke(Numbers.num(clojure.lang.Numbers.dec((long)clojure.lang.RT.count(((java.lang.Object)s2))))));
    } else {
     return RT.vector(((IFn)const__4.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(s2, const__8, Integer.valueOf(dotloc4)), ((IFn)const__7.getRawRoot()).invoke(s2, Numbers.num(clojure.lang.Numbers.inc((long)dotloc4)))), ((IFn)const__4.getRawRoot()).invoke(Numbers.num(clojure.lang.Numbers.dec((long)dotloc4))));
    }
   } else {
    if (clojure.lang.Numbers.isNeg((long)dotloc4)) {
     return RT.vector(((IFn)const__7.getRawRoot()).invoke(s2, const__8, Integer.valueOf(exploc3)), ((IFn)const__7.getRawRoot()).invoke(s2, Numbers.num(clojure.lang.Numbers.inc((long)exploc3))));
    } else {
     return RT.vector(((IFn)const__4.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(s2, const__8, const__10), ((IFn)const__7.getRawRoot()).invoke(s2, const__11, Integer.valueOf(exploc3))), ((IFn)const__7.getRawRoot()).invoke(s2, Numbers.num(clojure.lang.Numbers.inc((long)exploc3))));
    }
   }
  }
 }
}
