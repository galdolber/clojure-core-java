package clojure;

import clojure.lang.*;

public final class core_filter_fn__4251 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "chunk-buffer");
  const__5 = (java.lang.Object)0L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "chunk-append");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "chunk-cons");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "chunk");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "filter");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "cons");
 }
 Object coll2;
 Object pred1;
 public core_filter_fn__4251(final Object coll2, final Object pred1) {
  super();
  this.coll2 = coll2;
  this.pred1 = pred1;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll2);
   Object __r2494 = temp__4117__auto__1;
   if (__r2494 != null && !(__r2494 == Boolean.FALSE)) {
    {
     Object s2 = temp__4117__auto__1;
     Object __r2496 = ((IFn)const__1.getRawRoot()).invoke(s2);
     if (__r2496 != null && !(__r2496 == Boolean.FALSE)) {
      {
       Object c3 = ((IFn)const__2.getRawRoot()).invoke(s2);
       int size4 = clojure.lang.RT.count(((java.lang.Object)c3));
       Object b5 = ((IFn)const__4.getRawRoot()).invoke(Integer.valueOf(size4));
       {
        long n__4229__auto__6 = clojure.lang.RT.longCast((int)size4);
        {
         long i7 = 0L;
         while(true) {
          if (clojure.lang.Numbers.lt((long)i7, (long)n__4229__auto__6)) {
           Object __r2499 = ((IFn)this.pred1).invoke(((java.lang.Object)((clojure.lang.Indexed)c3).nth((int)RT.intCast(i7))));
           if (__r2499 != null && !(__r2499 == Boolean.FALSE)) {
            ((IFn)const__7.getRawRoot()).invoke(b5, ((java.lang.Object)((clojure.lang.Indexed)c3).nth((int)RT.intCast(i7))));
           } else {
           }
           long i7___aux = clojure.lang.Numbers.unchecked_inc((long)i7);
           i7 = i7___aux;
           continue;
          } else {
          }
          break;
         }
        }
       }
       return ((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(b5), ((IFn)const__11.getRawRoot()).invoke(this.pred1, ((IFn)const__12.getRawRoot()).invoke(s2)));
      }
     } else {
      {
       Object f8 = ((IFn)const__13.getRawRoot()).invoke(s2);
       Object r9 = ((IFn)const__14.getRawRoot()).invoke(s2);
       Object __r2501 = ((IFn)this.pred1).invoke(f8);
       if (__r2501 != null && !(__r2501 == Boolean.FALSE)) {
        return ((IFn)const__15.getRawRoot()).invoke(f8, ((IFn)const__11.getRawRoot()).invoke(this.pred1, r9));
       } else {
        return ((IFn)const__11.getRawRoot()).invoke(this.pred1, r9);
       }
      }
     }
    }
   } else {
    return null;
   }
  }
 }
}
