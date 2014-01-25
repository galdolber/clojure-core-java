package clojure;

import clojure.lang.*;

public final class core_make_array extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "make-array");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "alength");
  const__6 = (java.lang.Object)0L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "aset-int");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 public core_make_array() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object type1, java.lang.Object dim2, java.lang.Object more_dims3) {
  {
   Object dims4 = ((IFn)const__1.getRawRoot()).invoke(dim2, more_dims3);
   Object dimarray5 = ((IFn)const__2.getRawRoot()).invoke(((java.lang.Class)java.lang.Integer.TYPE), Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)dims4))));
   {
    long n__4366__auto__6 = clojure.lang.RT.longCast((int)clojure.lang.RT.alength((int[])((int[])dimarray5)));
    {
     long i7 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i7, (long)n__4366__auto__6)) {
       ((IFn)const__8.getRawRoot()).invoke(dimarray5, Numbers.num(i7), ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)dims4), (int)RT.intCast(i7))));
       long i7___aux = clojure.lang.Numbers.unchecked_inc((long)i7);
       i7 = i7___aux;
       continue;
      } else {
      }
      break;
     }
    }
   }
   return ((java.lang.Object)java.lang.reflect.Array.newInstance((java.lang.Class)((java.lang.Class)type1), (int[])((int[])dimarray5)));
  }
 }
 public java.lang.Object invoke(java.lang.Object type1, java.lang.Object len2) {
  return ((java.lang.Object)java.lang.reflect.Array.newInstance((java.lang.Class)((java.lang.Class)type1), (int)clojure.lang.RT.intCast(((java.lang.Object)len2))));
 }
 public int getRequiredArity() {
  return 2;
 }
}
