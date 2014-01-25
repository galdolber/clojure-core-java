package clojure;

import clojure.lang.*;

public final class pprint_extract_flags_fn__8121 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (java.lang.Object)2L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "empty?");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__6 = (clojure.lang.Var)RT.var("clojure.pprint", "flag-defs");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "format-error");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 public pprint_extract_flags_fn__8121() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__81201) {
  {
   Object vec__81222 = p__81201;
   Object s3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81222), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object offset4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81222), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object flags5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81222), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object __r5772 = ((IFn)const__4.getRawRoot()).invoke(s3);
   if (__r5772 != null && !(__r5772 == Boolean.FALSE)) {
    return RT.vector(null, RT.vector(s3, offset4, flags5));
   } else {
    {
     Object flag6 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)const__6.getRawRoot()), ((java.lang.Object)((IFn)const__7.getRawRoot()).invoke(s3))));
     Object __r5774 = flag6;
     if (__r5774 != null && !(__r5774 == Boolean.FALSE)) {
      Object __r5776 = ((IFn)const__8.getRawRoot()).invoke(flags5, flag6);
      if (__r5776 != null && !(__r5776 == Boolean.FALSE)) {
       return ((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke("Flag \"", ((IFn)const__7.getRawRoot()).invoke(s3), "\" appears more than once in a directive"), offset4);
      } else {
       return RT.vector(Boolean.TRUE, RT.vector(((IFn)const__11.getRawRoot()).invoke(s3, const__2), ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)offset4))), ((IFn)const__13.getRawRoot()).invoke(flags5, flag6, RT.vector(Boolean.TRUE, offset4))));
      }
     } else {
      return RT.vector(null, RT.vector(s3, offset4, flags5));
     }
    }
   }
  }
 }
}
