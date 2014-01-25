package clojure;

import clojure.lang.*;

public final class core_maybe_min_hash_iter__5103__5109_fn__5110 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "range");
  const__3 = (java.lang.Object)0L;
  const__4 = (java.lang.Object)31L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object iter__51030;
 Object s__51041;
 public core_maybe_min_hash_iter__5103__5109_fn__5110(final Object iter__51030, final Object s__51041) {
  super();
  this.iter__51030 = iter__51030;
  this.s__51041 = s__51041;
 }
 public java.lang.Object invoke() {
  {
   Object s__51041 = this.s__51041;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__51041);
     Object __r3280 = temp__4117__auto__2;
     if (__r3280 != null && !(__r3280 == Boolean.FALSE)) {
      {
       Object xs__4607__auto__3 = temp__4117__auto__2;
       {
        Object mask4 = ((IFn)const__1.getRawRoot()).invoke(xs__4607__auto__3);
        {
         Object iterys__4614__auto__5 = new clojure.core_maybe_min_hash_iter__5103__5109_fn__5110_iter__5105__5111(mask4);
         Object fs__4615__auto__6 = ((IFn)const__0.getRawRoot()).invoke(((IFn)iterys__4614__auto__5).invoke(((IFn)const__2.getRawRoot()).invoke(const__3, const__4)));
         Object __r3282 = fs__4615__auto__6;
         if (__r3282 != null && !(__r3282 == Boolean.FALSE)) {
          return ((IFn)const__5.getRawRoot()).invoke(fs__4615__auto__6, ((IFn)this.iter__51030).invoke(((IFn)const__6.getRawRoot()).invoke(s__51041)));
         } else {
          java.lang.Object s__51041___aux = ((IFn)const__6.getRawRoot()).invoke(s__51041);
          s__51041 = s__51041___aux;
          continue;
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
 }
}
