import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape>{

	private Shape [] shapes;
	int pos;
	
	public ShapeIterator(Shape []shapes){
		this.shapes = shapes;
	}
	@Override
	public boolean hasNext() {
		if(pos >= shapes.length || shapes[pos] == null)
			return false;
		return true;
	}
	public boolean hasPrev() {
		if(pos > 0 )
			return true;
		return false;
	}

	@Override
	public Shape next() {
		return shapes[pos++];
	}

	public Shape prev()
	{
		return shapes[pos=pos-1];
	}



	@Override
	public void remove() {
		if(pos <=0 )
			throw new IllegalStateException("Illegal position");
		if(shapes[pos-1] !=null){
			for (int i= pos-1; i<(shapes.length-1);i++){
				shapes[i] = shapes[i+1];
			}
			shapes[shapes.length-1] = null;
		}
	}
	public boolean contains(String shape) {
		//shape = shape.toString();
		boolean result = false;
		for(int i =0;i<shapes.length;i++)
		{


			if(shapes[i].toString().contains(shape))
			{
				result = true;
			}
		}
		return result;
	}

}
