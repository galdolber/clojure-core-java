package clojure;

import clojure.lang.*;

public final class pprint_get_sub_section_fn__7507 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "logical-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "nl-t?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "ancestor?");
 }
 Object lb3;
 public pprint_get_sub_section_fn__7507(final Object lb3) {
  super();
  this.lb3 = lb3;
 }
 public java.lang.Object invoke(java.lang.Object p1__7506_SHARP_1) {
  {
   Object nl_lb2 = RT.get(p1__7506_SHARP_1, Keyword.intern(null, "logical-block"));
   Object __r4919 = null;
   {
    Object and__3966__auto__3 = ((IFn)const__2.getRawRoot()).invoke(p1__7506_SHARP_1);
    Object __r4920;
    Object __r4921 = and__3966__auto__3;
    if (__r4921 != null && !(__r4921 == Boolean.FALSE)) {
     Object __r4922 = null;
     {
      boolean or__3968__auto__4 = clojure.lang.Util.equiv(((java.lang.Object)nl_lb2), ((java.lang.Object)this.lb3));
      Object __r4923;
      if (or__3968__auto__4) {
       __r4923 = (or__3968__auto__4 ? Boolean.TRUE : Boolean.FALSE);
      } else {
       __r4923 = ((IFn)const__4.getRawRoot()).invoke(nl_lb2, this.lb3);
      }
      __r4922 = __r4923;
     }
     __r4920 = __r4922;
    } else {
     __r4920 = and__3966__auto__3;
    }
    __r4919 = __r4920;
   }
   return ((IFn)const__1.getRawRoot()).invoke(__r4919);
  }
 }
}
