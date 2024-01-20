----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01/13/2024 01:52:32 PM
-- Design Name: 
-- Module Name: PriorityEncoder4Bit - Behavioral
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;
-- E. JAGADEESWAR PATRO -2241016309
entity PriorityEncoder4Bit is
    Port ( d0, d1, d2, d3 : in STD_LOGIC;
           x, y, v : out STD_LOGIC);
end PriorityEncoder4Bit;

architecture Dataflow of PriorityEncoder4Bit is

begin
x <= d2 or d3;
y <= d3 or (d1 and (not d2));
v <= d0 or d1 or d2 or d3;
end Dataflow;
