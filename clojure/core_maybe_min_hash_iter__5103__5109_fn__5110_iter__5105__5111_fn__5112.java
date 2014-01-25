package clojure;

import clojure.lang.*;

public final class core_maybe_min_hash_iter__5103__5109_fn__5110_iter__5105__5111_fn__5112 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
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
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-buffer");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "chunk-cons");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "chunk");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object mask4;
 Object s__51061;
 Object iter__51050;
 public core_maybe_min_hash_iter__5103__5109_fn__5110_iter__5105__5111_fn__5112(final Object mask4, final Object s__51061, final Object iter__51050) {
  super();
  this.mask4 = mask4;
  this.s__51061 = s__51061;
  this.iter__51050 = iter__51050;
 }
 public java.lang.Object invoke() {
  {
   Object s__51061 = this.s__51061;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__51061);
     Object __r3274 = temp__4117__auto__2;
     if (__r3274 != null && !(__r3274 == Boolean.FALSE)) {
      {
       Object s__51063 = temp__4117__auto__2;
       Object __r3276 = ((IFn)const__1.getRawRoot()).invoke(s__51063);
       if (__r3276 != null && !(__r3276 == Boolean.FALSE)) {
        {
         Object c__4616__auto__4 = ((IFn)const__2.getRawRoot()).invoke(s__51063);
         int size__4617__auto__5 = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4616__auto__4)));
         Object b__51086 = ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(size__4617__auto__5));
         Object __r3278 = ((IFn)new clojure.core_maybe_min_hash_iter__5103__5109_fn__5110_iter__5105__5111_fn__5112_fn__5113(this.mask4, c__4616__auto__4, b__51086, size__4617__auto__5)).invoke();
         if (__r3278 != null && !(__r3278 == Boolean.FALSE)) {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__51086), ((IFn)this.iter__51050).invoke(((IFn)const__8.getRawRoot()).invoke(s__51063)));
         } else {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__51086), null);
         }
        }
       } else {
        {
         Object shift7 = ((IFn)const__9.getRawRoot()).invoke(s__51063);
         return ((IFn)const__10.getRawRoot()).invoke(RT.vector(shift7, this.mask4), ((IFn)this.iter__51050).invoke(((IFn)const__11.getRawRoot()).invoke(s__51063)));
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
