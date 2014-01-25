package clojure.test;

import clojure.lang.*;

public final class tap_print_tap_diagnostic extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public tap_print_tap_diagnostic() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object data1) {
  {
   Object seq_72182 = ((IFn)const__0.getRawRoot()).invoke(((java.lang.String[])((java.lang.String)data1).split((java.lang.String)((java.lang.String)"\n"))));
   Object chunk_72193 = null;
   long count_72204 = 0L;
   long i_72215 = 0L;
   while(true) {
    if (clojure.lang.Numbers.lt((long)i_72215, (long)count_72204)) {
     {
      Object line6 = ((java.lang.Object)((clojure.lang.Indexed)chunk_72193).nth((int)RT.intCast(i_72215)));
      ((IFn)const__3.getRawRoot()).invoke("#", line6);
      long i_72215___aux = clojure.lang.Numbers.unchecked_inc((long)i_72215);
      i_72215 = i_72215___aux;
      continue;
     }
    } else {
     {
      Object temp__4117__auto__7 = ((IFn)const__0.getRawRoot()).invoke(seq_72182);
      Object __r4747 = temp__4117__auto__7;
      if (__r4747 != null && !(__r4747 == Boolean.FALSE)) {
       {
        Object seq_72188 = temp__4117__auto__7;
        Object __r4749 = ((IFn)const__5.getRawRoot()).invoke(seq_72188);
        if (__r4749 != null && !(__r4749 == Boolean.FALSE)) {
         {
          Object c__4343__auto__9 = ((IFn)const__6.getRawRoot()).invoke(seq_72188);
          java.lang.Object seq_72182___aux = ((IFn)const__7.getRawRoot()).invoke(seq_72188);
          java.lang.Object chunk_72193___aux = c__4343__auto__9;
          long count_72204___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__9)));
          long i_72215___aux = clojure.lang.RT.intCast((long)0L);
          seq_72182 = seq_72182___aux;
          chunk_72193 = chunk_72193___aux;
          count_72204 = count_72204___aux;
          i_72215 = i_72215___aux;
          continue;
         }
        } else {
         {
          Object line10 = ((IFn)const__10.getRawRoot()).invoke(seq_72188);
          ((IFn)const__3.getRawRoot()).invoke("#", line10);
          java.lang.Object seq_72182___aux = ((IFn)const__11.getRawRoot()).invoke(seq_72188);
          java.lang.Object chunk_72193___aux = null;
          long count_72204___aux = 0L;
          long i_72215___aux = 0L;
          seq_72182 = seq_72182___aux;
          chunk_72193 = chunk_72193___aux;
          count_72204 = count_72204___aux;
          i_72215 = i_72215___aux;
          continue;
         }
        }
       }
      } else {
       return null;
      }
     }
    }
   }
  }
 }
}
