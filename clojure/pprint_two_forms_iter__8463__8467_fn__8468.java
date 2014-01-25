package clojure;

import clojure.lang.*;

public final class pprint_two_forms_iter__8463__8467_fn__8468 extends clojure.lang.AFunction {
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
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
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
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object s__84641;
 Object iter__84630;
 public pprint_two_forms_iter__8463__8467_fn__8468(final Object s__84641, final Object iter__84630) {
  super();
  this.s__84641 = s__84641;
  this.iter__84630 = iter__84630;
 }
 public java.lang.Object invoke() {
  {
   Object s__84641 = this.s__84641;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__84641);
     Object __r6191 = temp__4117__auto__2;
     if (__r6191 != null && !(__r6191 == Boolean.FALSE)) {
      {
       Object s__84643 = temp__4117__auto__2;
       Object __r6193 = ((IFn)const__1.getRawRoot()).invoke(s__84643);
       if (__r6193 != null && !(__r6193 == Boolean.FALSE)) {
        {
         Object c__4616__auto__4 = ((IFn)const__2.getRawRoot()).invoke(s__84643);
         int size__4617__auto__5 = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4616__auto__4)));
         Object b__84666 = ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(size__4617__auto__5));
         Object __r6195 = ((IFn)new clojure.pprint_two_forms_iter__8463__8467_fn__8468_fn__8469(size__4617__auto__5, b__84666, c__4616__auto__4)).invoke();
         if (__r6195 != null && !(__r6195 == Boolean.FALSE)) {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__84666), ((IFn)this.iter__84630).invoke(((IFn)const__8.getRawRoot()).invoke(s__84643)));
         } else {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__84666), null);
         }
        }
       } else {
        {
         Object x7 = ((IFn)const__9.getRawRoot()).invoke(s__84643);
         return ((IFn)const__10.getRawRoot()).invoke(RT.vector(x7, RT.vector(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(x7))), ((IFn)const__13.getRawRoot()).invoke(x7))), ((IFn)this.iter__84630).invoke(((IFn)const__14.getRawRoot()).invoke(s__84643)));
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
