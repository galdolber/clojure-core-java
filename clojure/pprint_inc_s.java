package clojure;

import clojure.lang.*;

public final class pprint_inc_s extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Var const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__9 = (java.lang.Object)Character.valueOf((char)57);
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__12 = (java.lang.Object)0L;
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "char");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "-");
 }
 public pprint_inc_s() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   long len_12 = clojure.lang.Numbers.dec((long)clojure.lang.RT.count(((java.lang.Object)s1)));
   {
    long i3 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)len_12));
    while(true) {
     if (clojure.lang.Numbers.isNeg((long)i3)) {
      return ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), "1", ((IFn)const__6.getRawRoot()).invoke(Numbers.num(clojure.lang.Numbers.inc((long)len_12)), "0"));
     } else {
      if (clojure.lang.Util.equiv((char)((Character)const__9).charValue(), (char)((java.lang.String)s1).charAt((int)RT.intCast(i3)))) {
       long i3___aux = clojure.lang.Numbers.dec((long)i3);
       i3 = i3___aux;
       continue;
      } else {
       Object __r5238 = const__10;
       if (__r5238 != null && !(__r5238 == Boolean.FALSE)) {
        return ((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__11.getRawRoot()).invoke(s1, const__12, Numbers.num(i3)), Character.valueOf(clojure.lang.RT.charCast((long)clojure.lang.Numbers.inc((long)clojure.lang.RT.intCast((char)((java.lang.String)s1).charAt((int)RT.intCast(i3)))))), ((IFn)const__6.getRawRoot()).invoke(Numbers.num(clojure.lang.Numbers.minus((long)len_12, (long)i3)), "0"));
       } else {
        return null;
       }
      }
     }
    }
   }
  }
 }
}
