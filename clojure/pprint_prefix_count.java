package clojure;

import clojure.lang.*;

public final class pprint_prefix_count extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "coll?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "set");
  const__2 = (java.lang.Object)0L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "inc");
 }
 public pprint_prefix_count() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object aseq1, java.lang.Object val2) {
  {
   Object __r4838;
   Object __r4839 = ((IFn)const__0.getRawRoot()).invoke(val2);
   if (__r4839 != null && !(__r4839 == Boolean.FALSE)) {
    __r4838 = ((IFn)const__1.getRawRoot()).invoke(val2);
   } else {
    __r4838 = RT.set(val2);
   }
   Object test3 = __r4838;
   {
    long pos4 = 0L;
    while(true) {
     Object __r4841 = null;
     {
      boolean or__3968__auto__5 = clojure.lang.Util.equiv((long)pos4, (long)clojure.lang.RT.count(((java.lang.Object)aseq1)));
      Object __r4842;
      if (or__3968__auto__5) {
       __r4842 = (or__3968__auto__5 ? Boolean.TRUE : Boolean.FALSE);
      } else {
       __r4842 = ((IFn)const__5.getRawRoot()).invoke(((IFn)test3).invoke(((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)aseq1), (int)RT.intCast(pos4)))));
      }
      __r4841 = __r4842;
     }
     Object __r4843 = __r4841;
     if (__r4843 != null && !(__r4843 == Boolean.FALSE)) {
      return Numbers.num(pos4);
     } else {
      long pos4___aux = clojure.lang.Numbers.inc((long)pos4);
      pos4 = pos4___aux;
      continue;
     }
    }
   }
  }
 }
}
